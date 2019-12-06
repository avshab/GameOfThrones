package ru.skillbranch.gameofthrones.ui.splash_screen

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.snackbar.Snackbar
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.databinding.SplashScreenFragmentBinding
import ru.skillbranch.gameofthrones.ui.MainActivity


class SplashScreen : AppCompatActivity() {

    private lateinit var binding: SplashScreenFragmentBinding

    private lateinit var viewModel: SplashScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.splash_screen_fragment)
        binding.lifecycleOwner = this

        viewModel = ViewModelProviders.of(this).get(SplashScreenViewModel::class.java)

        viewModel.navigateNext().observe(this, Observer {

            if (!isNetworkAvailable() && it == false) {
                Snackbar.make(
                    binding.root,
                    getString(R.string.no_internet_error),
                    Snackbar.LENGTH_INDEFINITE

                ).show()
            }

            if (it == true) {
                intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(intent)
                viewModel.doneNavigating()
            }
        })

        binding.splashViewModel = viewModel
    }

    override fun onResume() {
        super.onResume()

        val alfaAnim = ObjectAnimator.ofFloat(binding.splashView, "alpha", 0f, 0.2f, 0f).apply {
            duration = 2000
            start()
        }

        alfaAnim.addUpdateListener { anim ->
            binding.splashView.alpha = anim.animatedValue as Float
        }

        alfaAnim.repeatCount = Animation.INFINITE


        val colorAnim = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 2000
            start()
        }

        val colorArray = mutableListOf(1f, 1f, 1f)
        colorAnim.addUpdateListener { anim ->
            colorArray[0] = 255 * anim.animatedFraction
            binding.splashView.setBackgroundColor(Color.HSVToColor(colorArray.toFloatArray()))
        }

        alfaAnim.repeatCount = Animation.INFINITE
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE)
        return if (connectivityManager is ConnectivityManager) {
            val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
            networkInfo?.isConnected ?: false
        } else false
    }
}