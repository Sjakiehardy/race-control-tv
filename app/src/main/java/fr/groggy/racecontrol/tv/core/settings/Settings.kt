package fr.groggy.racecontrol.tv.core.settings

data class Settings(
    val streamType: StreamType,
    val bypassChannelSelection: Boolean,
    val displayThumbnailsEnabled: Boolean,
    val openWithExternalPlayer: Boolean
) {
    enum class StreamType {
        HLS, DASH
    }

    companion object {
        val DEFAULT = Settings(
            streamType = StreamType.HLS,
            bypassChannelSelection = false,
            displayThumbnailsEnabled = true,
            openWithExternalPlayer = false
        )

        const val KEY_STREAM_TYPE = "stream_type"
        const val KEY_BYPASS_CHANNEL_SELECTION = "bypass_channel_selection"
        const val KEY_DISPLAY_THUMBNAILS_ENABLED = "display_thumbnails_enabled"
        const val KEY_OPEN_WITH_EXTERNAL_PLAYER = "open_with_external_player"
    }
}