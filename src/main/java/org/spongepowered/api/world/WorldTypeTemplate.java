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
package org.spongepowered.api.world;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.Key;
import org.spongepowered.api.data.persistence.DataView;
import org.spongepowered.api.data.value.Value;
import org.spongepowered.api.datapack.DataPack;
import org.spongepowered.api.datapack.DataPackEntry;
import org.spongepowered.api.util.DataPackEntryBuilder;

import java.io.IOException;

/**
 * A template for a {@link WorldType}.
 */
public interface WorldTypeTemplate extends DataPackEntry<WorldTypeTemplate>, WorldTypeDataFetcher {

    static WorldTypeTemplate.Builder overworld() {
        return WorldTypeTemplate.builder().fromValue(WorldTypes.OVERWORLD.get());
    }

    static WorldTypeTemplate.Builder overworldCaves() {
        return WorldTypeTemplate.builder().fromValue(WorldTypes.OVERWORLD_CAVES.get());
    }

    static WorldTypeTemplate.Builder theNether() {
        return WorldTypeTemplate.builder().fromValue(WorldTypes.THE_NETHER.get());
    }

    static WorldTypeTemplate.Builder theEnd() {
        return WorldTypeTemplate.builder().fromValue(WorldTypes.THE_END.get());
    }

    static Builder builder() {
        return Sponge.game().builderProvider().provide(Builder.class).reset();
    }

    /**
     * Returns the world type.
     *
     * @return The world type
     */
    WorldType worldType();

    interface Builder extends DataPackEntryBuilder<WorldType, WorldTypeTemplate, Builder> {

        <V> Builder add(Key<? extends Value<V>> key, V value);

        /**
         * Creates a world template based on the given data view.
         * <p>The given data must be equivalent to a data-pack for world-templates (dimension)</p>
         *
         * @param pack The data
         * @return This builder, for chaining
         */
        Builder fromDataPack(DataView pack) throws IOException;

        Builder from(WorldType type);

        Builder pack(DataPack<WorldTypeTemplate> pack);
    }

}
