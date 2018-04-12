class Box(_item: String) {
    val item = _item

    def open() = {
        println("宝箱を開いた。" + item + "を手に入れた。")
    }
}

class JewelryBox(_item: String) extends Box(_item: String) {
    def look() = {
        println("宝箱はキラキラと輝いている")
    }
}

object Inheri {
    def main(args: Array[String]): Unit = {
        val box = new Box("鋼鉄の剣")
        box.open()

        val jewelrybox = new JewelryBox("魔法の指輪")
        jewelrybox.look()
        jewelrybox.open()
    }
}
