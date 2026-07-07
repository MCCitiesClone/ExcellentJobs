package su.nightexpress.excellentjobs.grind.adapter.impl;

// InfiniteFishing (com.pm2.infinitefishing) is not published to any Maven repository.
// The entire adapter is commented out until a resolvable artifact is available.
// Re-enable this class together with the pom.xml dependency and the registration in GrindManager.
/*
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import com.pm2.infinitefishing.InfiniteFishing;
import com.pm2.infinitefishing.api.items.fish.CustomFish;
import com.pm2.infinitefishing.nbt.NBTManager;

import su.nightexpress.excellentjobs.grind.adapter.AbstractGrindAdapter;

@NullMarked
public class InfiniteFishingAdapter extends AbstractGrindAdapter<CustomFish, ItemStack> {

    private final InfiniteFishing api;

    public InfiniteFishingAdapter(String name) {
        super(name, "infinitefishing");
        this.api = JavaPlugin.getPlugin(InfiniteFishing.class);
    }

    @Override
    public @Nullable CustomFish adaptFromBukkit(ItemStack entity) {
        String id = NBTManager.get().getIdFromItem(entity);
        if (id == null) return null;

        return api.getFishManager().getFish(id);
    }

    @Override
    public @Nullable CustomFish adaptFromName(String internalName) {
        return this.api.getFishManager().getFish(internalName);
    }

    @Override
    public String getInternalName(CustomFish type) {
        return type.getId();
    }

    @Override
    public boolean canHandle(ItemStack entity) {
        return this.adaptFromBukkit(entity) != null;
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
*/
