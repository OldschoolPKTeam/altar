package gg.rsmod.plugins.content.objs.altar

private val ALTAR = setOf(Objs.CHAOS_ALTAR_411, Objs.ALTAR_39642, Objs.CHAOS_ALTAR, Objs.ALTAR_14860, Objs.ALTAR_409)

ALTAR.forEach { altar ->

    on_obj_option(obj = altar, option = "Pray-at") {
        player.queue {
            player.lock()
            player.getSkills().restore(5)
            player.animate(645)
            player.message("You boost your prayer points.")
            wait(3)
            player.unlock()
        }
    }
}