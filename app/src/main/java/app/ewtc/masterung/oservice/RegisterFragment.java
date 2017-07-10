package app.ewtc.masterung.oservice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by masterung on 7/10/2017 AD.
 */

public class RegisterFragment extends Fragment{

    public static RegisterFragment registerInstant() {
        RegisterFragment registerFragment = new RegisterFragment();
        Bundle bundle = new Bundle();
        registerFragment.setArguments(bundle);
        return registerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.register_fragment_layout, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Back Controller
        backController();

        //Save Controller
        saveController();


    }

    private void saveController() {

        //Initial View
        ImageView imageView = (ImageView) getView().findViewById(R.id.imvSave);
        final EditText nameEditText = (EditText) getView().findViewById(R.id.edtName);
        final EditText userEditText = (EditText) getView().findViewById(R.id.edtUser);
        final EditText passwordEditText = (EditText) getView().findViewById(R.id.edtPassword);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get Value From Edit Text
                String strName = nameEditText.getText().toString().trim();
                String strUser = userEditText.getText().toString().trim();
                String strPassword = passwordEditText.getText().toString().trim();

                //Check Space
                if (strName.equals("") || strUser.equals("") || strPassword.equals("")) {
                    //Have Space

                    MyAlert myAlert = new MyAlert(getActivity());
                    myAlert.myDialog(getString(R.string.have_space),
                            getString(R.string.message_have_space));

                } else {
                    //Have No Space
                }

            }
        });

    }

    private void backController() {
        ImageView imageView = (ImageView) getView().findViewById(R.id.imvBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainContent, MainFragment.mainInstant())
                        .commit();

            }
        });
    }

}   // Main Class
