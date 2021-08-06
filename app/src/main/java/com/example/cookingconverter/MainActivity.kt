package com.example.cookingconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cookingconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener { convertUnit() }
    }

    private fun convertUnit() {
        val stringInTextField = binding.measurementToConvert.text.toString()
        val convert = stringInTextField.toDoubleOrNull()
        if (convert == null) {
            binding.convertResult.text = ""
            return
        }

        val convertedUnit = when (binding.fromOptions.checkedRadioButtonId) {
            R.id.from_ounces -> { convert * 28.349523125 }
            R.id.from_grams -> { convert * 0.035274 }
            R.id.from_fluid_ounces -> { convert * 0.0295735 }
            R.id.from_liters -> { convert * 33.814 }
            R.id.from_temp_f -> { convert - 32 * 5 / 9 }
            else -> { convert * 9 / 5 + 32 }
        }

        binding.convertResult.text = when (binding.fromOptions.checkedRadioButtonId) {
            R.id.from_ounces -> {
                getString(R.string.conversion_text, convert.toString(), "ounce(s)", (convert * 28.3349523125).toString(), "gram(s)")
            }
            R.id.from_grams -> {
                getString(R.string.conversion_text, convert.toString(), "gram(s)", (convert * 0.035274).toString(), "ounce(s)")
            }
            R.id.from_fluid_ounces -> {
                getString(R.string.conversion_text, convert.toString(), "fluid ounce(s)", (convert * 0.0295735).toString(), "liter(s)")
            }
            R.id.from_liters -> {
                getString(R.string.conversion_text, convert.toString(), "liter(s)", (convert * 33.814).toString(), "ounce(s)")
            }
            R.id.from_temp_f -> {
                getString(R.string.conversion_text, convert.toString(), "°F", (convert - 32 * 5 / 9).toString(), "°C")
            }
            else -> {
                getString(R.string.conversion_text, convert.toString(), "°C", (convert * 9 / 5 + 32).toString(), "°F")
            }
        }
    }
}