package pl.kacper90.purinecalculator.dao

class Food(val id: Long?, val name: String, val purineAcidValue: Long) {

    constructor(name: String, purineAcidValue: Long) : this(null, name, purineAcidValue)

}