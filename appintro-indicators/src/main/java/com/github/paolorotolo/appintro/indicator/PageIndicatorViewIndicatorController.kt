package com.github.paolorotolo.appintro.indicator

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.rd.PageIndicatorView
import com.rd.animation.type.AnimationType

class PageIndicatorViewIndicatorController(
        context: Context,
        attrs: AttributeSet? = null,
        private val animationType: AnimationType = AnimationType.NONE
) : PageIndicatorView(context, attrs), IndicatorController {

    override var selectedIndicatorColor: Int = 0
        set(value) {
            field = value
            this.selectedColor = value
        }

    override var unselectedIndicatorColor: Int = 0
        set(value) {
            field = value
            this.unselectedColor = value
        }

    override fun newInstance(context: Context): View {
        return this
    }

    override fun initialize(slideCount: Int) {
        count = slideCount
        selectPosition(0)
        setAnimationType(animationType)
    }

    override fun selectPosition(index: Int) {
        selection = index
    }
}
