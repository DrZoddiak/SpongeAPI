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
package org.spongepowered.api.tag;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;
import org.spongepowered.api.world.biome.Biome;

/**
 * <!-- This file is automatically generated. Any manual changes will be overwritten. -->
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.GAME)
public final class BiomeTags {

    // @formatter:off
    public static final Tag<Biome> ALLOWS_SURFACE_SLIME_SPAWNS = BiomeTags.key(ResourceKey.minecraft("allows_surface_slime_spawns"));

    public static final Tag<Biome> ALLOWS_TROPICAL_FISH_SPAWNS_AT_ANY_HEIGHT = BiomeTags.key(ResourceKey.minecraft("allows_tropical_fish_spawns_at_any_height"));

    public static final Tag<Biome> HAS_CLOSER_WATER_FOG = BiomeTags.key(ResourceKey.minecraft("has_closer_water_fog"));

    public static final Tag<Biome> HAS_STRUCTURE_ANCIENT_CITY = BiomeTags.key(ResourceKey.minecraft("has_structure/ancient_city"));

    public static final Tag<Biome> HAS_STRUCTURE_BASTION_REMNANT = BiomeTags.key(ResourceKey.minecraft("has_structure/bastion_remnant"));

    public static final Tag<Biome> HAS_STRUCTURE_BURIED_TREASURE = BiomeTags.key(ResourceKey.minecraft("has_structure/buried_treasure"));

    public static final Tag<Biome> HAS_STRUCTURE_DESERT_PYRAMID = BiomeTags.key(ResourceKey.minecraft("has_structure/desert_pyramid"));

    public static final Tag<Biome> HAS_STRUCTURE_END_CITY = BiomeTags.key(ResourceKey.minecraft("has_structure/end_city"));

    public static final Tag<Biome> HAS_STRUCTURE_IGLOO = BiomeTags.key(ResourceKey.minecraft("has_structure/igloo"));

    public static final Tag<Biome> HAS_STRUCTURE_JUNGLE_TEMPLE = BiomeTags.key(ResourceKey.minecraft("has_structure/jungle_temple"));

    public static final Tag<Biome> HAS_STRUCTURE_MINESHAFT = BiomeTags.key(ResourceKey.minecraft("has_structure/mineshaft"));

    public static final Tag<Biome> HAS_STRUCTURE_MINESHAFT_MESA = BiomeTags.key(ResourceKey.minecraft("has_structure/mineshaft_mesa"));

    public static final Tag<Biome> HAS_STRUCTURE_NETHER_FORTRESS = BiomeTags.key(ResourceKey.minecraft("has_structure/nether_fortress"));

    public static final Tag<Biome> HAS_STRUCTURE_NETHER_FOSSIL = BiomeTags.key(ResourceKey.minecraft("has_structure/nether_fossil"));

    public static final Tag<Biome> HAS_STRUCTURE_OCEAN_MONUMENT = BiomeTags.key(ResourceKey.minecraft("has_structure/ocean_monument"));

    public static final Tag<Biome> HAS_STRUCTURE_OCEAN_RUIN_COLD = BiomeTags.key(ResourceKey.minecraft("has_structure/ocean_ruin_cold"));

    public static final Tag<Biome> HAS_STRUCTURE_OCEAN_RUIN_WARM = BiomeTags.key(ResourceKey.minecraft("has_structure/ocean_ruin_warm"));

    public static final Tag<Biome> HAS_STRUCTURE_PILLAGER_OUTPOST = BiomeTags.key(ResourceKey.minecraft("has_structure/pillager_outpost"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_DESERT = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_desert"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_JUNGLE = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_jungle"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_MOUNTAIN = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_mountain"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_NETHER = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_nether"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_OCEAN = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_ocean"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_STANDARD = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_standard"));

    public static final Tag<Biome> HAS_STRUCTURE_RUINED_PORTAL_SWAMP = BiomeTags.key(ResourceKey.minecraft("has_structure/ruined_portal_swamp"));

    public static final Tag<Biome> HAS_STRUCTURE_SHIPWRECK = BiomeTags.key(ResourceKey.minecraft("has_structure/shipwreck"));

    public static final Tag<Biome> HAS_STRUCTURE_SHIPWRECK_BEACHED = BiomeTags.key(ResourceKey.minecraft("has_structure/shipwreck_beached"));

    public static final Tag<Biome> HAS_STRUCTURE_STRONGHOLD = BiomeTags.key(ResourceKey.minecraft("has_structure/stronghold"));

    public static final Tag<Biome> HAS_STRUCTURE_SWAMP_HUT = BiomeTags.key(ResourceKey.minecraft("has_structure/swamp_hut"));

    public static final Tag<Biome> HAS_STRUCTURE_VILLAGE_DESERT = BiomeTags.key(ResourceKey.minecraft("has_structure/village_desert"));

    public static final Tag<Biome> HAS_STRUCTURE_VILLAGE_PLAINS = BiomeTags.key(ResourceKey.minecraft("has_structure/village_plains"));

    public static final Tag<Biome> HAS_STRUCTURE_VILLAGE_SAVANNA = BiomeTags.key(ResourceKey.minecraft("has_structure/village_savanna"));

    public static final Tag<Biome> HAS_STRUCTURE_VILLAGE_SNOWY = BiomeTags.key(ResourceKey.minecraft("has_structure/village_snowy"));

    public static final Tag<Biome> HAS_STRUCTURE_VILLAGE_TAIGA = BiomeTags.key(ResourceKey.minecraft("has_structure/village_taiga"));

    public static final Tag<Biome> HAS_STRUCTURE_WOODLAND_MANSION = BiomeTags.key(ResourceKey.minecraft("has_structure/woodland_mansion"));

    public static final Tag<Biome> INCREASED_FIRE_BURNOUT = BiomeTags.key(ResourceKey.minecraft("increased_fire_burnout"));

    public static final Tag<Biome> IS_BADLANDS = BiomeTags.key(ResourceKey.minecraft("is_badlands"));

    public static final Tag<Biome> IS_BEACH = BiomeTags.key(ResourceKey.minecraft("is_beach"));

    public static final Tag<Biome> IS_DEEP_OCEAN = BiomeTags.key(ResourceKey.minecraft("is_deep_ocean"));

    public static final Tag<Biome> IS_END = BiomeTags.key(ResourceKey.minecraft("is_end"));

    public static final Tag<Biome> IS_FOREST = BiomeTags.key(ResourceKey.minecraft("is_forest"));

    public static final Tag<Biome> IS_HILL = BiomeTags.key(ResourceKey.minecraft("is_hill"));

    public static final Tag<Biome> IS_JUNGLE = BiomeTags.key(ResourceKey.minecraft("is_jungle"));

    public static final Tag<Biome> IS_MOUNTAIN = BiomeTags.key(ResourceKey.minecraft("is_mountain"));

    public static final Tag<Biome> IS_NETHER = BiomeTags.key(ResourceKey.minecraft("is_nether"));

    public static final Tag<Biome> IS_OCEAN = BiomeTags.key(ResourceKey.minecraft("is_ocean"));

    public static final Tag<Biome> IS_OVERWORLD = BiomeTags.key(ResourceKey.minecraft("is_overworld"));

    public static final Tag<Biome> IS_RIVER = BiomeTags.key(ResourceKey.minecraft("is_river"));

    public static final Tag<Biome> IS_SAVANNA = BiomeTags.key(ResourceKey.minecraft("is_savanna"));

    public static final Tag<Biome> IS_TAIGA = BiomeTags.key(ResourceKey.minecraft("is_taiga"));

    public static final Tag<Biome> MINESHAFT_BLOCKING = BiomeTags.key(ResourceKey.minecraft("mineshaft_blocking"));

    public static final Tag<Biome> MORE_FREQUENT_DROWNED_SPAWNS = BiomeTags.key(ResourceKey.minecraft("more_frequent_drowned_spawns"));

    public static final Tag<Biome> PLAYS_UNDERWATER_MUSIC = BiomeTags.key(ResourceKey.minecraft("plays_underwater_music"));

    public static final Tag<Biome> POLAR_BEARS_SPAWN_ON_ALTERNATE_BLOCKS = BiomeTags.key(ResourceKey.minecraft("polar_bears_spawn_on_alternate_blocks"));

    public static final Tag<Biome> PRODUCES_CORALS_FROM_BONEMEAL = BiomeTags.key(ResourceKey.minecraft("produces_corals_from_bonemeal"));

    public static final Tag<Biome> REDUCE_WATER_AMBIENT_SPAWNS = BiomeTags.key(ResourceKey.minecraft("reduce_water_ambient_spawns"));

    public static final Tag<Biome> REQUIRED_OCEAN_MONUMENT_SURROUNDING = BiomeTags.key(ResourceKey.minecraft("required_ocean_monument_surrounding"));

    public static final Tag<Biome> SNOW_GOLEM_MELTS = BiomeTags.key(ResourceKey.minecraft("snow_golem_melts"));

    public static final Tag<Biome> SPAWNS_COLD_VARIANT_FROGS = BiomeTags.key(ResourceKey.minecraft("spawns_cold_variant_frogs"));

    public static final Tag<Biome> SPAWNS_GOLD_RABBITS = BiomeTags.key(ResourceKey.minecraft("spawns_gold_rabbits"));

    public static final Tag<Biome> SPAWNS_SNOW_FOXES = BiomeTags.key(ResourceKey.minecraft("spawns_snow_foxes"));

    public static final Tag<Biome> SPAWNS_WARM_VARIANT_FROGS = BiomeTags.key(ResourceKey.minecraft("spawns_warm_variant_frogs"));

    public static final Tag<Biome> SPAWNS_WHITE_RABBITS = BiomeTags.key(ResourceKey.minecraft("spawns_white_rabbits"));

    public static final Tag<Biome> STRONGHOLD_BIASED_TO = BiomeTags.key(ResourceKey.minecraft("stronghold_biased_to"));

    public static final Tag<Biome> WATER_ON_MAP_OUTLINES = BiomeTags.key(ResourceKey.minecraft("water_on_map_outlines"));

    public static final Tag<Biome> WITHOUT_PATROL_SPAWNS = BiomeTags.key(ResourceKey.minecraft("without_patrol_spawns"));

    public static final Tag<Biome> WITHOUT_WANDERING_TRADER_SPAWNS = BiomeTags.key(ResourceKey.minecraft("without_wandering_trader_spawns"));

    public static final Tag<Biome> WITHOUT_ZOMBIE_SIEGES = BiomeTags.key(ResourceKey.minecraft("without_zombie_sieges"));

    // @formatter:on
    private BiomeTags() {
    }

    private static Tag<Biome> key(final ResourceKey key) {
        return Tag.of(RegistryTypes.BIOME, key);
    }
}