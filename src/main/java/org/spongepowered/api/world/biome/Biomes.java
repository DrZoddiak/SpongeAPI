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
package org.spongepowered.api.world.biome;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registry;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryReference;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;
import org.spongepowered.api.world.server.ServerWorld;

/**
 * <!-- This file is automatically generated. Any manual changes will be overwritten. -->
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.WORLD)
public final class Biomes {

    // @formatter:off
    public static final RegistryReference<Biome> BADLANDS = Biomes.key(ResourceKey.minecraft("badlands"));

    public static final RegistryReference<Biome> BAMBOO_JUNGLE = Biomes.key(ResourceKey.minecraft("bamboo_jungle"));

    public static final RegistryReference<Biome> BASALT_DELTAS = Biomes.key(ResourceKey.minecraft("basalt_deltas"));

    public static final RegistryReference<Biome> BEACH = Biomes.key(ResourceKey.minecraft("beach"));

    public static final RegistryReference<Biome> BIRCH_FOREST = Biomes.key(ResourceKey.minecraft("birch_forest"));

    public static final RegistryReference<Biome> COLD_OCEAN = Biomes.key(ResourceKey.minecraft("cold_ocean"));

    public static final RegistryReference<Biome> CRIMSON_FOREST = Biomes.key(ResourceKey.minecraft("crimson_forest"));

    public static final RegistryReference<Biome> DARK_FOREST = Biomes.key(ResourceKey.minecraft("dark_forest"));

    public static final RegistryReference<Biome> DEEP_COLD_OCEAN = Biomes.key(ResourceKey.minecraft("deep_cold_ocean"));

    public static final RegistryReference<Biome> DEEP_FROZEN_OCEAN = Biomes.key(ResourceKey.minecraft("deep_frozen_ocean"));

    public static final RegistryReference<Biome> DEEP_LUKEWARM_OCEAN = Biomes.key(ResourceKey.minecraft("deep_lukewarm_ocean"));

    public static final RegistryReference<Biome> DEEP_OCEAN = Biomes.key(ResourceKey.minecraft("deep_ocean"));

    public static final RegistryReference<Biome> DESERT = Biomes.key(ResourceKey.minecraft("desert"));

    public static final RegistryReference<Biome> DRIPSTONE_CAVES = Biomes.key(ResourceKey.minecraft("dripstone_caves"));

    public static final RegistryReference<Biome> END_BARRENS = Biomes.key(ResourceKey.minecraft("end_barrens"));

    public static final RegistryReference<Biome> END_HIGHLANDS = Biomes.key(ResourceKey.minecraft("end_highlands"));

    public static final RegistryReference<Biome> END_MIDLANDS = Biomes.key(ResourceKey.minecraft("end_midlands"));

    public static final RegistryReference<Biome> ERODED_BADLANDS = Biomes.key(ResourceKey.minecraft("eroded_badlands"));

    public static final RegistryReference<Biome> FLOWER_FOREST = Biomes.key(ResourceKey.minecraft("flower_forest"));

    public static final RegistryReference<Biome> FOREST = Biomes.key(ResourceKey.minecraft("forest"));

    public static final RegistryReference<Biome> FROZEN_OCEAN = Biomes.key(ResourceKey.minecraft("frozen_ocean"));

    public static final RegistryReference<Biome> FROZEN_PEAKS = Biomes.key(ResourceKey.minecraft("frozen_peaks"));

    public static final RegistryReference<Biome> FROZEN_RIVER = Biomes.key(ResourceKey.minecraft("frozen_river"));

    public static final RegistryReference<Biome> GROVE = Biomes.key(ResourceKey.minecraft("grove"));

    public static final RegistryReference<Biome> ICE_SPIKES = Biomes.key(ResourceKey.minecraft("ice_spikes"));

    public static final RegistryReference<Biome> JAGGED_PEAKS = Biomes.key(ResourceKey.minecraft("jagged_peaks"));

    public static final RegistryReference<Biome> JUNGLE = Biomes.key(ResourceKey.minecraft("jungle"));

    public static final RegistryReference<Biome> LUKEWARM_OCEAN = Biomes.key(ResourceKey.minecraft("lukewarm_ocean"));

    public static final RegistryReference<Biome> LUSH_CAVES = Biomes.key(ResourceKey.minecraft("lush_caves"));

    public static final RegistryReference<Biome> MEADOW = Biomes.key(ResourceKey.minecraft("meadow"));

    public static final RegistryReference<Biome> MUSHROOM_FIELDS = Biomes.key(ResourceKey.minecraft("mushroom_fields"));

    public static final RegistryReference<Biome> NETHER_WASTES = Biomes.key(ResourceKey.minecraft("nether_wastes"));

    public static final RegistryReference<Biome> OCEAN = Biomes.key(ResourceKey.minecraft("ocean"));

    public static final RegistryReference<Biome> OLD_GROWTH_BIRCH_FOREST = Biomes.key(ResourceKey.minecraft("old_growth_birch_forest"));

    public static final RegistryReference<Biome> OLD_GROWTH_PINE_TAIGA = Biomes.key(ResourceKey.minecraft("old_growth_pine_taiga"));

    public static final RegistryReference<Biome> OLD_GROWTH_SPRUCE_TAIGA = Biomes.key(ResourceKey.minecraft("old_growth_spruce_taiga"));

    public static final RegistryReference<Biome> PLAINS = Biomes.key(ResourceKey.minecraft("plains"));

    public static final RegistryReference<Biome> RIVER = Biomes.key(ResourceKey.minecraft("river"));

    public static final RegistryReference<Biome> SAVANNA = Biomes.key(ResourceKey.minecraft("savanna"));

    public static final RegistryReference<Biome> SAVANNA_PLATEAU = Biomes.key(ResourceKey.minecraft("savanna_plateau"));

    public static final RegistryReference<Biome> SMALL_END_ISLANDS = Biomes.key(ResourceKey.minecraft("small_end_islands"));

    public static final RegistryReference<Biome> SNOWY_BEACH = Biomes.key(ResourceKey.minecraft("snowy_beach"));

    public static final RegistryReference<Biome> SNOWY_PLAINS = Biomes.key(ResourceKey.minecraft("snowy_plains"));

    public static final RegistryReference<Biome> SNOWY_SLOPES = Biomes.key(ResourceKey.minecraft("snowy_slopes"));

    public static final RegistryReference<Biome> SNOWY_TAIGA = Biomes.key(ResourceKey.minecraft("snowy_taiga"));

    public static final RegistryReference<Biome> SOUL_SAND_VALLEY = Biomes.key(ResourceKey.minecraft("soul_sand_valley"));

    public static final RegistryReference<Biome> SPARSE_JUNGLE = Biomes.key(ResourceKey.minecraft("sparse_jungle"));

    public static final RegistryReference<Biome> STONY_PEAKS = Biomes.key(ResourceKey.minecraft("stony_peaks"));

    public static final RegistryReference<Biome> STONY_SHORE = Biomes.key(ResourceKey.minecraft("stony_shore"));

    public static final RegistryReference<Biome> SUNFLOWER_PLAINS = Biomes.key(ResourceKey.minecraft("sunflower_plains"));

    public static final RegistryReference<Biome> SWAMP = Biomes.key(ResourceKey.minecraft("swamp"));

    public static final RegistryReference<Biome> TAIGA = Biomes.key(ResourceKey.minecraft("taiga"));

    public static final RegistryReference<Biome> THE_END = Biomes.key(ResourceKey.minecraft("the_end"));

    public static final RegistryReference<Biome> THE_VOID = Biomes.key(ResourceKey.minecraft("the_void"));

    public static final RegistryReference<Biome> WARM_OCEAN = Biomes.key(ResourceKey.minecraft("warm_ocean"));

    public static final RegistryReference<Biome> WARPED_FOREST = Biomes.key(ResourceKey.minecraft("warped_forest"));

    public static final RegistryReference<Biome> WINDSWEPT_FOREST = Biomes.key(ResourceKey.minecraft("windswept_forest"));

    public static final RegistryReference<Biome> WINDSWEPT_GRAVELLY_HILLS = Biomes.key(ResourceKey.minecraft("windswept_gravelly_hills"));

    public static final RegistryReference<Biome> WINDSWEPT_HILLS = Biomes.key(ResourceKey.minecraft("windswept_hills"));

    public static final RegistryReference<Biome> WINDSWEPT_SAVANNA = Biomes.key(ResourceKey.minecraft("windswept_savanna"));

    public static final RegistryReference<Biome> WOODED_BADLANDS = Biomes.key(ResourceKey.minecraft("wooded_badlands"));

    // @formatter:on
    private Biomes() {
    }

    public static Registry<Biome> registry(final ServerWorld world) {
        return world.registry(RegistryTypes.BIOME);
    }

    private static RegistryReference<Biome> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.BIOME, location).asReference();
    }
}
