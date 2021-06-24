package com.example.s5e6
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.squareup.picasso.Picasso


class DetailFragment : Fragment() {

    private var value = ""
    private var info = ""
    private var audio = ""
    private  var video = ""
    private var pic = ""


    fun getNewInstance(value:Word): DetailFragment{
        val fragment = DetailFragment()
        fragment.value = value.id
        fragment.info = value.value
        fragment.audio = value.audio
        fragment.video = value.video
        fragment.pic = value.pic
        return fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Toast.makeText(requireContext(),this.value, Toast.LENGTH_SHORT).show()
        val tvWord = view.findViewById<TextView>(R.id.tvWord)
        val image = view.findViewById<ImageView>(R.id.imageView2)
        val description = view.findViewById<TextView>(R.id.tvDescription)
        val btnVolume = view.findViewById<ImageButton>(R.id.btnVolume)
        val button2 = view.findViewById<Button>(R.id.button2)

        tvWord.setText(this.value.toString())
        description.text = this.info


        Picasso.with(requireContext()).load(this.pic).into(image);


        val url = audio.toString() // your URL here
        MediaPlayer().apply {
            setAudioAttributes(
                    AudioAttributes.Builder()
                            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                            .setUsage(AudioAttributes.USAGE_MEDIA)
                            .build()
            )

           btnVolume.setOnClickListener {
               setDataSource(url)
               prepare() // might take long! (for buffering, etc)
               start()
            }
               val videoView = view.findViewById<VideoView>(R.id.videoView)
               val mediaController = MediaController(requireContext())
               mediaController.setAnchorView(videoView)

               val onlineUri = Uri.parse(video)

               videoView.setMediaController(mediaController)


            button2.setOnClickListener {
                button2.visibility = View.INVISIBLE

                videoView.setVideoURI(onlineUri)
                videoView.requestFocus()
                videoView.start()
            }


        }

    }

}