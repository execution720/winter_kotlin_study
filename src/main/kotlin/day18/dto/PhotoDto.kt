package day18.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PixabayResponse(
    val total: Int?,
    val totalHits: Int?,
    val hits: List<PhotoDto>?
)

@Serializable
data class PhotoDto(
    val id: Long?,
    val pageURL: String?,
    val type: String?,
    val tags: String?,
    val previewURL: String?,
    val previewWidth: Int?,
    val previewHeight: Int?,
    val webformatURL: String?,
    val webformatWidth: Int?,
    val webformatHeight: Int?,
    val largeImageURL: String?,
    val imageWidth: Int?,
    val imageHeight: Int?,
    val imageSize: Int?,
    val views: Int?,
    val downloads: Int?,
    val collections: Int?,
    val likes: Int?,
    val comments: Int?,
    @SerialName("user_id")
    val userId: Long?,
    val user: String?,
    val userImageURL: String?
)
