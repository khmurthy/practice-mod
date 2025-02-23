package com.khmurthy.practicemod;

import com.khmurthy.practicemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticeMod implements ModInitializer {
	public static final String MOD_ID = "practice-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}