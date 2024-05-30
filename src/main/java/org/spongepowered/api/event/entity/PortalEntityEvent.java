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
package org.spongepowered.api.event.entity;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.Cancellable;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.util.annotation.eventgen.AbsoluteSortPosition;
import org.spongepowered.api.util.annotation.eventgen.NoFactoryMethod;
import org.spongepowered.api.world.portal.Portal;
import org.spongepowered.math.vector.Vector3d;

import java.util.Optional;

/**
 * Called when an {@link Entity} is using a {@link Portal}.
 */
@NoFactoryMethod
public interface PortalEntityEvent extends Event {

    /**
     * Gets the {@link Entity}.
     *
     * @return The entity
     */
    @AbsoluteSortPosition(1)
    Entity entity();

    Portal portal();

    /**
     * Called when entering a portal.
     * Cancel to prevent portal effects.
     */
    interface Enter extends PortalEntityEvent, Cancellable {
        int portalTransitionTime();
        Optional<Integer> customPortalTransitionTime();
        void setCustomPortalTransitionTime(int ticks);
    }

    /**
     * Called before calculating and generating the portal exit.
     * Canceling resets the portal transition time
     * Setting a custom portal can change the teleport behaviour. TODO {@link Portal}
     * TODO {@link org.spongepowered.api.block.BlockTypes#NETHER_PORTAL} should be a portal instance
     * TODO sponge provided Portal instances for vanilla
     * TODO portal builder? for custom plugin code
     */
    // This is before the portal logic ran, as such no blocks should be generated yet
    interface Pre extends PortalEntityEvent, Cancellable {
        // TODO for vanilla we could allow changing the Portal
        // TODO expose vanilla portals + sponge variants without block generation?
        void setPortal(Portal portal);
    }

    // DimensionTransition was obtained, portal blocks are generated

    /**
     * Called after a {@link Portal} calculated and generated the portal exit.
     * Note that {@link ChangeEntityWorldEvent} still fire after this.
     */
    interface Teleport extends PortalEntityEvent, ChangeEntityWorldEvent.Reposition, RotateEntityEvent {

        // TODO cancel -> rollback block generation? @gabizou?

        Vector3d exitSpeed();
        void setExitSpeed(Vector3d speed);

    }


}
