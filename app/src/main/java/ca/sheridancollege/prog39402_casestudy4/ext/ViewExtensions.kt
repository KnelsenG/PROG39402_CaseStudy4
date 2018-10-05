package ca.sheridancollege.prog39402_casestudy4.ext

import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import ca.sheridancollege.prog39402_casestudy4.R

fun ImageView.loadImage(urlOrResource: Any) {
    Glide.with(context)
            .load(urlOrResource)
            .apply(
                    RequestOptions()
                            .error(ContextCompat.getDrawable(context, R.mipmap.ic_launcher))
            )
            .into(this)
}

