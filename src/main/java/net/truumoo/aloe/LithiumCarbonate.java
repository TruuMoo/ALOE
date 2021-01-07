package net.truumoo.aloe;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.prug.prugutils.main.ConfigurableDrinkableEffectType;
import org.jetbrains.annotations.Nullable;

public class LithiumCarbonate extends ConfigurableDrinkableEffectType {
    public LithiumCarbonate(Settings settings, StatusEffect type1, int durration1, int multiplyer1, @Nullable ItemConvertible returnItem) {
        super(settings, type1, durration1, multiplyer1, returnItem);
        settings.group(Aloe.ITEM_GROUP);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }
}
