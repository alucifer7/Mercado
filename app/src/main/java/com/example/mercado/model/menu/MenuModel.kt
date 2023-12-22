package com.example.mercado.model.menu

/**
 * Created by Paulo Fernandes on 21,janeiro,2023
 */
class MenuModel {

    var id: Int? = 0
    var name: String? = ""

    constructor()

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    fun getListMenu(): List<MenuModel> {
        val listMenu: MutableList<MenuModel> = arrayListOf()
        listMenu.add(MenuModel(1, "CRIAR"))
        listMenu.add(MenuModel(2, "EDITAR"))
        listMenu.add(MenuModel(3, "ATUALIZAR"))
        listMenu.add(MenuModel(4, "EXCLUIR"))

        return listMenu
    }

}