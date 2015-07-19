package bam.backgroundgeolocation.bgloc.data;

import android.content.Context;

import bam.backgroundgeolocation.bgloc.data.sqlite.SQLiteLocationDAO;

public abstract class DAOFactory {
	public static LocationDAO createLocationDAO(Context context) {
		//Very basic for now
		return new SQLiteLocationDAO(context);
	}
}
