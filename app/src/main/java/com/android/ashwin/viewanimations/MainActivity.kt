package com.android.ashwin.viewanimations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bounce_down_button.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce_down)
            target.startAnimation(animation)
            target.postOnAnimation {
                target.visibility = View.VISIBLE
            }
        }

        bounce_up_button.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce_up)
            target.startAnimation(animation)
            target.postOnAnimation {
                target.visibility = View.VISIBLE
            }
        }

        fade_in_button.setOnClickListener {
            target.visibility = View.INVISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            target.startAnimation(animation)
            target.postOnAnimation {
                target.visibility = View.VISIBLE
            }
        }

        fade_out_button.setOnClickListener {
            target.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            target.startAnimation(animation)
            target.postOnAnimation {
                target.visibility = View.INVISIBLE
            }
        }

        zoom_in_button.setOnClickListener {
            target.visibility = View.INVISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            target.startAnimation(animation)
            target.postOnAnimation {
                target.visibility = View.VISIBLE
            }
        }

        zoom_out_button.setOnClickListener {
            target.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            target.startAnimation(animation)
            target.postOnAnimation {
                target.visibility = View.INVISIBLE
            }
        }
    }
}
