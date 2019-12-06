package ru.skillbranch.gameofthrones.ui.character_screen

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter

class CharacterScreenDirections private constructor() {
    private data class ActionCharacterScreenSelf(val relativeCharacter: RelativeCharacter) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_characterScreen_self

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(RelativeCharacter::class.java)) {
                result.putParcelable("relativeCharacter", this.relativeCharacter as Parcelable)
            } else if (Serializable::class.java.isAssignableFrom(RelativeCharacter::class.java)) {
                result.putSerializable("relativeCharacter", this.relativeCharacter as Serializable)
            } else {
                throw UnsupportedOperationException(RelativeCharacter::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionCharacterScreenSelf(relativeCharacter: RelativeCharacter): NavDirections =
                ActionCharacterScreenSelf(relativeCharacter)
    }
}
