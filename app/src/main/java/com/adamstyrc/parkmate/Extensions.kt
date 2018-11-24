package com.adamstyrc.parkmate

import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.GeoPoint
import com.mapbox.mapboxsdk.geometry.LatLng

fun DocumentSnapshot.getLocation()  = data!!.get("location") as GeoPoint

fun GeoPoint.toLatLnt() = LatLng(latitude, longitude)