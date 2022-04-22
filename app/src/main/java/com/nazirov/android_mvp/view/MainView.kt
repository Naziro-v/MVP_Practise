package com.nazirov.android_mvp.view

import com.nazirov.android_mvp.model.Post

interface MainView {

    fun onPostListSuccess(posts: ArrayList<Post>?)
    fun onPostListFailure(error : String)

    fun onPostDeleteSuccess(post: Post?)
    fun onPostDeleteFailure(error: String)
}