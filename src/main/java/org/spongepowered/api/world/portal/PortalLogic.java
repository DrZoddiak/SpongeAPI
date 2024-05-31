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

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.util.Axis;
import org.spongepowered.api.util.ResettableBuilder;
import org.spongepowered.api.world.server.ServerLocation;
import org.spongepowered.api.world.server.ServerWorld;
import org.spongepowered.math.vector.Vector3d;
import org.spongepowered.math.vector.Vector3i;

import java.util.Optional;

/**
 * A type of portal, used to move {@link Entity entities} one place to another.
 */
public interface PortalLogic {

    static Builder builder() {
        return Sponge.game().builderProvider().provide(Builder.class);
    }
    static Factory factory() {
        return Sponge.game().factoryProvider().provide(Factory.class);
    }

    Optional<PortalExitCalculator> exitCalculator();
    Optional<PortalFinder> finder();

    Optional<PortalGenerator> generator();

    // TODO found/generated portal block from TwoDimensionalPortal

    /**
     * TODO can we keep this?
     * Teleports an {@link Entity} through this {@link PortalLogic portal}.
     *
     * <p>The location is meant to be a hint and no expectation should be made that the portal
     * will be exactly at the location.</p>
     *
     * <p>No assumption should be made that the generation of the destination portal will match
     * the original portal, this is left up to the plugin dev to decide.</p>
     *
     * @param entity                    The entity
     * @param destination               The destination
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
        PortalLogic endPortal();

        /**
         * The default vanilla {@link org.spongepowered.api.block.BlockTypes#END_GATEWAY}.
         *
         * @return the portal type
         */
        PortalLogic endGateway();

        /**
         * The default vanilla {@link org.spongepowered.api.block.BlockTypes#NETHER_PORTAL}.
         *
         * @return the portal type
         */
        PortalLogic netherPortal();

        /**
         * The vanilla nether portal finder.
         * <p>Searches only for existing nether portals.</p>
         *
         * @return the portal finder.
         */
        PortalFinder netherPortalFinder();

        /**
         * Generates nothing.
         *
         * @return the no op portal generator
         */
        PortalFinder noOpFinder();

        /**
         * Generates a vanilla nether portal.
         *
         * @return the portal generator
         */
        PortalGenerator netherPortalGenerator();

        /**
         * Generates the end spawn platform
         *
         * @return the portal generator
         */
        PortalGenerator endPortalGenerator();


        /**
         * Generates nothing.
         *
         * @return the no op portal generator
         */
        PortalGenerator noOpGenerator();

    }


    interface Builder extends ResettableBuilder<PortalLogic, Builder> {

        Builder netherPortal(ResourceKey origin, ResourceKey target); // default scale

        Builder netherPortal(ResourceKey origin, ResourceKey target, double scale);

        Builder findNetherPortal(ResourceKey origin, ResourceKey target); // default scale

        Builder findNetherPortal(ResourceKey origin, ResourceKey target, double scale);

        Builder endPortal(ResourceKey origin, ResourceKey target);

        Builder endPortal(ResourceKey origin, ResourceKey target, Vector3i targetPos);

        Builder targetPortal(ResourceKey origin, ResourceKey target, Vector3d targetPos);

        Builder spawnPortal(ResourceKey origin, ResourceKey target);

        default Builder portal(PortalExitCalculator calulator) {
            return this.portal(calulator, PortalLogic.factory().noOpGenerator());
        }

        default Builder portal(PortalExitCalculator calulator, PortalFinder finder) {
            return this.portal(calulator, finder, PortalLogic.factory().noOpGenerator());
        }

        default Builder portal(PortalExitCalculator calulator, PortalGenerator generator) {
            return this.portal(calulator, PortalLogic.factory().noOpFinder(), generator);
        }

        // TODO search-range for PortalFinder
        // TODO axis

        Builder portal(PortalExitCalculator calulator, PortalFinder finder, PortalGenerator generator);


        PortalLogic build();

    }

    @FunctionalInterface
    interface PortalExitCalculator {

        /**
         * Calculates a desired portal exit location
         * to find an existing portal using {@link PortalFinder}
         * or generate a new one using {@link PortalGenerator}
         * in {@link PortalLogic}
         *
         * @param from    the original world
         * @param fromPos the original position
         * @param entity  the entity
         *
         * @return the exit location if available
         */
        Optional<ServerLocation> calculatePortalExit(ServerWorld from, Vector3i fromPos, Entity entity);
    }



    @FunctionalInterface
    interface PortalFinder {

        /**
         * Searches for an existing portal at the {@link ServerLocation location}.
         *
         * <p>If an existing portal is not found
         * a new one may be generated using {@link PortalGenerator}
         * in {@link PortalLogic}</p>
         *
         * <p>It is left up to the discretion of the implementer how this is done.
         * Portals come in all shapes and sizes or none at all.</p>
         *
         * <p>The location and search range is meant to be a hint and no expectation
         * should be made that the a portal will be exactly at the location.</p>
         *
         * @param at          the location to search around
         * @param searchRange the range to search around
         *
         * @return the position of an existing portal if found
         */
        Optional<Vector3d> findPortal(ServerLocation at, int searchRange);
    }


    @FunctionalInterface
    interface PortalGenerator {

        /**
         * Attempts to generate the portal at the {@link ServerLocation location}.
         *
         * <p>It is left up to the discretion of the implementer how this is done.
         * Portals come in all shapes and sizes or none at all.</p>
         *
         * <p>The location and axis are meant to be hints and should not be considered to be the exact
         * final location/orientation of the resulting portal.</p>
         *
         * @param location The location
         * @param axis     The axis
         *
         * @return the adjusted teleport location if generated
         */
        Optional<Vector3d> generatePortal(ServerLocation location, Axis axis);

    }

}
