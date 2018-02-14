package com.ducat.assigmentconactlist;

import java.util.ArrayList;

/**
 * Created by javed on 14/02/18.
 */

public class contactlist {

    public static ArrayList<String> ContactArray = new ArrayList<String>();

    public static void addcontact(String s)
    {
            ContactArray.add(s);

    }

    public static ArrayList<String> getcontact()
    {

        return ContactArray;
    }

}
