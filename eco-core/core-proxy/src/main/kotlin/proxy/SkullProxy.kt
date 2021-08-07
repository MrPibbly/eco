package proxy

import com.willfp.eco.core.proxy.AbstractProxy
import org.bukkit.inventory.meta.SkullMeta

interface SkullProxy : AbstractProxy {
    fun setSkullTexture(
        meta: SkullMeta,
        base64: String
    )
}