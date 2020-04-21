package com.example.demorepositorypattern.data.model

class Student {
    var mID: Int = 0
    lateinit var mName: String
    lateinit var mPhone: String
    lateinit var mAddress: String
    lateinit var mEmail: String

    constructor()

    constructor(
        mID: Int,
        mName: String,
        mPhone: String,
        mAddress: String,
        mEmail: String
    ) {
        this.mID = mID
        this.mName = mName
        this.mPhone = mPhone
        this.mAddress = mAddress
        this.mEmail = mEmail
    }

    constructor(
        mName: String,
        mPhone: String,
        mAddress: String,
        mEmail: String
    ) {
        this.mName = mName
        this.mPhone = mPhone
        this.mAddress = mAddress
        this.mEmail = mEmail
    }

    override fun toString(): String {
        return "$mID - $mName - $mPhone - $mAddress - $mEmail"
    }
}
