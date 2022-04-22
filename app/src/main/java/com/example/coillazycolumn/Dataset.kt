package com.example.coillazycolumn

data class MyArrayItem  (
    var id:Long,
    var title: String,
    var image: String
)

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<MyArrayItem> {
            val list = ArrayList<MyArrayItem>()
            list.add(
                MyArrayItem(
                    0,
                    "Aang",
                    "https://static.wikia.nocookie.net/avatar/images/a/ae/Aang_at_Jasmine_Dragon.png/revision/latest?cb=20130612174003",
                )
            )
            list.add(
                MyArrayItem(
                    1,
                    "Katara",
                    "https://static.wikia.nocookie.net/avatar/images/7/7a/Katara_smiles_at_coronation.png/revision/latest?cb=20150104171449",
                )
            )

            list.add(
                MyArrayItem(
                    2,
                    "Sokka",
                    "https://static.wikia.nocookie.net/avatar/images/c/cc/Sokka.png/revision/latest?cb=20140905085428",
                )
            )
            list.add(
                MyArrayItem(
                    3,
                    "Error",
                    "https://static.wikia.nocookie.net/avatar/images/c/cc/Sosdgfsdgsdkka.png/revision/latest?cb=20140905085428",
                )
            )
            list.add(
                MyArrayItem(
                    4,
                    "Zuko",
                    "https://static.wikia.nocookie.net/avatar/images/4/4b/Zuko.png/revision/latest?cb=20180630112142",
                )
            )
            list.add(
                MyArrayItem(
                    5,
                    "Toph",
                    "https://static.wikia.nocookie.net/avatar/images/4/46/Toph_Beifong.png/revision/latest?cb=20131230122047",
                )
            )
            list.add(
                MyArrayItem(
                    6,
                    "Azula",
                    "https://static.wikia.nocookie.net/avatar/images/1/12/Azula.png/revision/latest?cb=20140905084941",
                )
            )
            list.add(
                MyArrayItem(
                    7,
                    "Iroh",
                    "https://static.wikia.nocookie.net/avatar/images/c/c1/Iroh_smiling.png/revision/latest?cb=20130626131914",
                )
            )
            list.add(
                MyArrayItem(
                    8,
                    "Appa",
                    "https://static.wikia.nocookie.net/avatar/images/6/65/Appa_flying.png/revision/latest?cb=20140517110636",
                )
            )
            return list
        }
    }
}