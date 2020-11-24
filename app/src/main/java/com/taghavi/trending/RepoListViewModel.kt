package com.taghavi.trending

import android.content.ClipData
import androidx.lifecycle.MutableLiveData

class RepoListViewModel : BaseViewModel() {
    val repoListLive = MutableLiveData<List<ClipData.Item>>()

    fun fetchRepoList() {
        dataLoading.value = true
        RepoRepository.getInstance().getRepoList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                repoListLive.value = response?.items
                empty.value = false
            } else {
                empty.value = true
            }
        }
    }
}