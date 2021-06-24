package com.example.s5e6
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class DictionaireFragment : Fragment() {

    private val value = "Hello everyone!!"
    private var listener = FragmentListener {  }
    lateinit var adapter: ArrayAdapter<Word>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dictionaire, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dictList = view.findViewById<ListView>(R.id.dictList)
        adapter = ArrayAdapter(this.requireContext(), android.R.layout.simple_list_item_1,getListWords())
        dictList.adapter = adapter
        dictList.setOnItemClickListener { parent, view, position, id ->
            if (listener!=null)
                listener.onItemClick(getListWords()[position])
        }

    }





    private fun getListWords(): Array<Word> {
        val source = arrayOf(
            Word("covid 19",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("vaccine",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("drone",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("lifestyle",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("nature",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("medical",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("sport",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("business",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("people",
                "La maladieà coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
            ,Word("animal",
                "La maladie à coronavirus 2019 Écouter ou la, ou lea, Covid-19 Écouter (acronyme anglais de coronavirus disease 2019), est une maladie infectieuse émergente de type zoonose virale causée par la souche de coronavirus SARS-CoV-2. Les symptômes les plus fréquents sont la fièvre, la toux, la fatigue et la gêne respiratoire. Dans les formes les plus graves, l'apparition d'un syndrome de détresse respiratoire aiguë peut entraîner la mort, notamment chez les personnes plus fragiles du fait de leur âge ou en cas de comorbidités. Une autre complication mortelle est une réponse exacerbée du système immunitaire inné (choc cytokinique). "
                ,"https://freetts.com/audio/7c94f448-1bf2-4af1-afbb-31703e3620f3.mp3"
                ,"https://cdn.videvo.net/videvo_files/video/free/2020-12/small_watermarked/201211_03_Covid%20Vaccine_4k_005_preview.webm"
                , "https://www.apsf.org/wp-content/uploads/newsletters/2020/3502/coronavirus-covid-19-300x300.png")
        )
        return source
    }

    public fun setOnFragmentListener(listener: FragmentListener){
        this.listener = listener
    }




}