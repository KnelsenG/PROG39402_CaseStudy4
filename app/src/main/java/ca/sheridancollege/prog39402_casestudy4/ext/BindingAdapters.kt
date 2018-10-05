package ca.sheridancollege.prog39402_casestudy4.ext

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageResource")
fun imageResource(imageView: ImageView, source: Any) {
    imageView.loadImage(source)
}