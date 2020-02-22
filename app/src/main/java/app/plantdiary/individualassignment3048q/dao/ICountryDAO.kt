package app.plantdiary.individualassignment3048q.dao

import app.plantdiary.individualassignment3048q.dto.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ICountryDAO {

    @GET("/core/country-list")
    fun getAllCountries(): Call<ArrayList<Country>>

    @GET("/core/country-list")
    fun getCountries(@Query("Combined_Name")CountryName:String) : Call<ArrayList<Country>>

}