/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.world.portal;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.registry.DefaultedRegistryValue;
import org.spongepowered.api.util.Axis;
import org.spongepowered.api.util.ResettableBuilder;
import org.spongepowered.api.util.annotation.CatalogedBy;
import org.spongepowered.api.world.server.ServerLocation;
import org.spongepowered.api.world.server.ServerWorld;
import org.spongepowered.math.vector.Vector3d;
import org.spongepowered.math.vector.Vector3i;

import java.util.Map;
import java.util.Optional;

/**
 * A type of portal, used to move {@link Entity entities} one place to another.
 */
@CatalogedBy(PortalTypes.class)
public interface PortalType extends DefaultedRegistryValue {

    static Builder builder() {
        return Sponge.game().builderProvider().provide(Builder.class);
    }

    /**
     * Generates the portal at the {@link ServerLocation location}.
     *
     * <p>It is left up to the discretion of the plugin developer on how this is implemented.
     * Portals come in all shapes and sizes or none at all.</p>
     *
     * <p>The location and axis are meant to be hints and should not be considered to be the exact
     * final location/orientation of the resulting portal.</p>
     *
     * @param location The location
     * @param axis The axis
     * @return true if a portal could be generated
     */
    boolean generatePortal(ServerLocation location, Axis axis);

    /**
     * Finds a {@link Portal} from a {@link ServerLocation location}.
     *
     * <p>It is left up to the discretion of the plugin developer on how this is implemented.
     * In vanilla minecraft, portals are calculated on-demand and therefore this may never
     * return an actual value.</p>
     *
     * <p>The location is meant to be a hint and no expectation should be made that the {@link Portal}
     * will be exactly at the location.</p>
     *
     * @param location The location
     * @return The portal or {@link Optional#empty()} if not found
     */
    Optional<Portal> findPortal(ServerLocation location);

    /**
     * Teleports an {@link Entity} through this {@link PortalType portal}.
     *
     * <p>The location is meant to be a hint and no expectation should be made that the portal
     * will be exactly at the location.</p>
     *
     * <p>No assumption should be made that the generation of the destination portal will match
     * the original portal, this is left up to the plugin dev to decide.</p>
     *
     * @param entity The entity
     * @param destination The destination
     * @param generateDestinationPortal True if the portal should generate a destination one
     * @return True if teleport successful, false if not
     */
    boolean teleport(Entity entity, ServerLocation destination, boolean generateDestinationPortal);



    interface Factory {

        /**
         * The default vanilla {@link org.spongepowered.api.block.BlockTypes#END_PORTAL}.
         *
         * @return the portal type
         */
        PortalType endPortal();
        /**
         * The default vanilla {@link org.spongepowered.api.block.BlockTypes#END_GATEWAY}.
         *
         * @return the portal type
         */
        PortalType endGateway();

        /**
         * The default vanilla {@link org.spongepowered.api.block.BlockTypes#NETHER_PORTAL}.
         *
         * @return the portal type
         */
        PortalType netherPortal();

        /**
         * Only finds existing nether portals. But never creates one.
         *
         * @return the portal type
         */
        PortalType netherPortalFinder();

        default void example() {
            final ResourceKey overworld = ResourceKey.minecraft("overworld");
            final ResourceKey end = ResourceKey.minecraft("end");
            final ResourceKey nether = ResourceKey.minecraft("nether");
            Map<ServerWorld, ServerLocation> lookup = Map.of(); // dont actually save it like this


            var portal = builder()
                .endPortal(overworld, end, Vector3i.ONE) // places platform at target location
                .targetPortal(end, overworld, Vector3d.ONE) // just teleports
                .build()
                ;

            var vanillaEndPortalClone = builder()
                .endPortal(overworld, end) // vanilla end target + places platform
                .spawnPortal(end, overworld) // teleports to spawn
                .build()
                ;

            var portalTriangle = builder()
                .spawnPortal(overworld, nether)
                .spawnPortal(nether, end)
                .spawnPortal(end, overworld)
                .build()
                ;

            var findNetherPortal = builder()
                .findNetherPortal(overworld, nether)
                .build();

            var pluginLookup = builder()
                .portal((from, e, fromPos) -> lookup.get(from))
                .build();

            var inWorldScaling = builder()
                .portal((from, e, fromPos) -> ServerLocation.of(from, fromPos.mul(8)))
                .build();

        }
    }



    interface Builder extends ResettableBuilder<PortalType, Builder> {

        Builder netherPortal(ResourceKey origin, ResourceKey target); // default scale
        Builder netherPortal(ResourceKey origin, ResourceKey target, double scale);
        Builder findNetherPortal(ResourceKey origin, ResourceKey target); // default scale
        Builder findNetherPortal(ResourceKey origin, ResourceKey target, double scale);
        Builder endPortal(ResourceKey origin, ResourceKey target);
        Builder endPortal(ResourceKey origin, ResourceKey target, Vector3i targetPos);
        Builder targetPortal(ResourceKey origin, ResourceKey target, Vector3d targetPos);
        Builder spawnPortal(ResourceKey origin, ResourceKey target);

        Builder portal(PortalExitFinder exitFinder);

        PortalType build();
    }

    @FunctionalInterface
    interface PortalExitFinder {
        @Nullable ServerLocation findPortalExit(ServerWorld from, Entity entity, Vector3i fromPos);
    }



}
