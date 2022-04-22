package com.nazirov.android_mvp.presenter

import com.nazirov.android_mvp.model.Post

interface MainPresenterImpl {
    fun apiPostList()
    fun apiPostDelete(post: Post)
}