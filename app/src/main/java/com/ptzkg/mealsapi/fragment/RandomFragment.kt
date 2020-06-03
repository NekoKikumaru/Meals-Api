package com.ptzkg.mealsapi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.ptzkg.mealsapi.R
import com.ptzkg.mealsapi.model.Meal
import com.ptzkg.mealsapi.viewmodel.RandomViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_random.*

class RandomFragment : Fragment() {
    private lateinit var randomViewModel: RandomViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_random, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeView()
    }

    override fun onResume() {
        super.onResume()
        randomViewModel.loadResult()
    }

    fun observeView() {
        randomViewModel = ViewModelProvider(this).get(RandomViewModel::class.java)
        randomViewModel.getResult().observe(viewLifecycleOwner, Observer {
            result -> bind(result)
        })
    }

    fun bind(meal: Meal) {
        txtMeal.text = meal.strMeal
        Picasso.get().load(meal.strMealThumb).placeholder(R.drawable.loading).into(imgMeal)
        if(meal.strDrinkAlternate != null) {
            txtDrinkTitle.text="Drink Alternative:"
            txtDrink.text = meal.strDrinkAlternate
        }
        txtCategory.text = meal.strCategory
        txtArea.text = meal.strArea

        txtIngredient1.text = meal.strIngredient1
        txtIngredient2.text = meal.strIngredient2
        txtIngredient3.text = meal.strIngredient3
        txtIngredient4.text = meal.strIngredient4
        txtIngredient5.text = meal.strIngredient5
        txtIngredient6.text = meal.strIngredient6
        txtIngredient7.text = meal.strIngredient7
        txtIngredient8.text = meal.strIngredient8
        txtIngredient9.text = meal.strIngredient9
        txtIngredient10.text = meal.strIngredient10
        txtIngredient11.text = meal.strIngredient11
        txtIngredient12.text = meal.strIngredient12
        txtIngredient13.text = meal.strIngredient13
        txtIngredient14.text = meal.strIngredient14
        txtIngredient15.text = meal.strIngredient15
        txtIngredient16.text = meal.strIngredient16
        txtIngredient17.text = meal.strIngredient17
        txtIngredient18.text = meal.strIngredient18
        txtIngredient19.text = meal.strIngredient19
        txtIngredient20.text = meal.strIngredient20
        var ingredients = ArrayList<TextView>()
        ingredients.add(txtIngredient1)
        ingredients.add(txtIngredient2)
        ingredients.add(txtIngredient3)
        ingredients.add(txtIngredient4)
        ingredients.add(txtIngredient5)
        ingredients.add(txtIngredient6)
        ingredients.add(txtIngredient7)
        ingredients.add(txtIngredient8)
        ingredients.add(txtIngredient9)
        ingredients.add(txtIngredient10)
        ingredients.add(txtIngredient11)
        ingredients.add(txtIngredient12)
        ingredients.add(txtIngredient13)
        ingredients.add(txtIngredient14)
        ingredients.add(txtIngredient15)
        ingredients.add(txtIngredient16)
        ingredients.add(txtIngredient17)
        ingredients.add(txtIngredient18)
        ingredients.add(txtIngredient19)
        ingredients.add(txtIngredient20)
        hideNull(ingredients)

        txtMeasure1.text = meal.strMeasure1
        txtMeasure2.text = meal.strMeasure2
        txtMeasure3.text = meal.strMeasure3
        txtMeasure4.text = meal.strMeasure4
        txtMeasure5.text = meal.strMeasure5
        txtMeasure6.text = meal.strMeasure6
        txtMeasure7.text = meal.strMeasure7
        txtMeasure8.text = meal.strMeasure8
        txtMeasure9.text = meal.strMeasure9
        txtMeasure10.text = meal.strMeasure10
        txtMeasure11.text = meal.strMeasure11
        txtMeasure12.text = meal.strMeasure12
        txtMeasure13.text = meal.strMeasure13
        txtMeasure14.text = meal.strMeasure14
        txtMeasure15.text = meal.strMeasure15
        txtMeasure16.text = meal.strMeasure16
        txtMeasure17.text = meal.strMeasure17
        txtMeasure18.text = meal.strMeasure18
        txtMeasure19.text = meal.strMeasure19
        txtMeasure20.text = meal.strMeasure20
        txtInstruction.text = meal.strInstructions
        var measures = ArrayList<TextView>()
        measures.add(txtMeasure1)
        measures.add(txtMeasure2)
        measures.add(txtMeasure3)
        measures.add(txtMeasure4)
        measures.add(txtMeasure5)
        measures.add(txtMeasure6)
        measures.add(txtMeasure7)
        measures.add(txtMeasure8)
        measures.add(txtMeasure9)
        measures.add(txtMeasure10)
        measures.add(txtMeasure11)
        measures.add(txtMeasure12)
        measures.add(txtMeasure13)
        measures.add(txtMeasure14)
        measures.add(txtMeasure15)
        measures.add(txtMeasure16)
        measures.add(txtMeasure17)
        measures.add(txtMeasure18)
        measures.add(txtMeasure19)
        measures.add(txtMeasure20)
        hideNull(measures)
    }

    fun hideNull(textviews: ArrayList<TextView>) {
        for(tv in textviews) {
            if(tv.text == "" || tv.text == null) {
                tv.visibility = View.GONE
            }
        }
    }
}
