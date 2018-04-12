# ScalaInheritance
継承

## 処理
`Box()`クラスを親クラスとして`JewelryBox()`クラスを子クラスにして処理を行う。

## コード
```
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
```

## 出力例  
```
宝箱を開いた。鋼鉄の剣を手に入れた。
宝箱はキラキラと輝いている
宝箱を開いた。魔法の指輪を手に入れた。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 仮想化ソフト | Oracle VM VirtualBox 5.2 |
| 構築ソフト | Vagrant 2.0.2 |
| 仮想化上OS | CentOS 6.9 |
| SSHクライアント | PuTTY 0.6.8 |
| FTPクライアント | Cyberduck 6.3.5 |
| エディタ | Atom 1.24.0 |
| 開発言語 | Scala 2.12.4 |
