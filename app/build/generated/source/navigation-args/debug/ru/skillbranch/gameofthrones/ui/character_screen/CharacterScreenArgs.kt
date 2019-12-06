package ru.skillbranch.gameofthrones.ui.character_screen

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter

data class CharacterScreenArgs(val relativeCharacter: RelativeCharacter) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
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

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): CharacterScreenArgs {
            bundle.setClassLoader(CharacterScreenArgs::class.java.classLoader)
            val __relativeCharacter : RelativeCharacter?
            if (bundle.containsKey("relativeCharacter")) {
                if (Parcelable::class.java.isAssignableFrom(RelativeCharacter::class.java) ||
                        Serializable::class.java.isAssignableFrom(RelativeCharacter::class.java)) {
                    __relativeCharacter = bundle.get("relativeCharacter") as RelativeCharacter?
                } else {
                    throw UnsupportedOperationException(RelativeCharacter::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__relativeCharacter == null) {
                    throw IllegalArgumentException("Argument \"relativeCharacter\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"relativeCharacter\" is missing and does not have an android:defaultValue")
            }
            return CharacterScreenArgs(__relativeCharacter)
        }
    }
}
