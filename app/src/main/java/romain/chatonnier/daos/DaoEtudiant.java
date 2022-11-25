package romain.chatonnier.daos;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import romain.chatonnier.beans.Etudiant;
import romain.chatonnier.net.WSConnexionHTTPS;

public class DaoEtudiant {
    private static DaoEtudiant instance = null;
    private final List<Etudiant> etudiants;
    private final ObjectMapper om = new ObjectMapper();

    private DaoEtudiant() {
        etudiants = new ArrayList<>();
    }

    public List<Etudiant> getLocalEtudiants() {
        return etudiants;
    }

    public static DaoEtudiant getInstance() {
        if (instance == null) {
            instance = new DaoEtudiant();
        }
        return instance;
    }

    public void getEtudiants(Delegate delegate) {
        String url = "uc=getEtudiants";
        WSConnexionHTTPS wsConnexionHTTPS = new WSConnexionHTTPS() {
            @Override
            protected void onPostExecute(String s) {
                traiterRetourGetEtudiants(s, delegate);
            }
        };
        wsConnexionHTTPS.execute(url);
    }

    private void traiterRetourGetEtudiants(String s, Delegate delegate) {
        try {
            etudiants.clear();
            Arrays.asList(om.readValue(s, Etudiant[].class)).forEach(etudiant -> etudiants.add(etudiant));
            delegate.whenWSConnexionIsTerminated(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
