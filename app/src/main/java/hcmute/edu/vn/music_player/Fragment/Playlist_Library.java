package hcmute.edu.vn.music_player.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hcmute.edu.vn.music_player.Activity.PlayMedia;
import hcmute.edu.vn.music_player.R;
import hcmute.edu.vn.music_player.databinding.FragmentPlaylistLibraryBinding;


public class Playlist_Library extends Fragment {
    FragmentPlaylistLibraryBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding=FragmentPlaylistLibraryBinding.inflate(inflater,container,false);
        View view=binding.getRoot();
        Intent intent = new Intent(getActivity(), PlayMedia.class);
        startActivity(intent);
        return view;
    }
}