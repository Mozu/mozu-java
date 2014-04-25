package com.mozu.example.RetailExample.model.persistence;

import android.content.Context;
import android.content.SharedPreferences;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.security.AuthTicket;

import org.joda.time.DateTime;

import java.lang.reflect.Type;

/**
 * Created by rodrigo_alvarez on 2/21/14.
 */
public enum Storage {

    INSTANCE;

    private final String PREFERENCES = "mozuRetailAppStorage";


    // For serializing/deserializing joda DateTime
    private static class DateTimeTypeConverter implements JsonSerializer<DateTime>, JsonDeserializer<DateTime> {
        @Override
        public JsonElement serialize(DateTime src, Type srcType, JsonSerializationContext context) {
            return new JsonPrimitive(src.toString());
        }
        @Override
        public DateTime deserialize(JsonElement json, Type type, JsonDeserializationContext context)
                throws JsonParseException {
            return new DateTime(json.getAsString());
        }
    }


    public void clearSession(Context ctx) {
        SharedPreferences prefs = ctx.getSharedPreferences(PREFERENCES, 0);
        prefs.edit().clear().commit();
    }

    public AuthTicket getUserAuthTicket(Context ctx) {

        AuthTicket ticket = null;

        SharedPreferences prefs = ctx.getSharedPreferences(PREFERENCES, 0);
        String authTicketJson = prefs.getString("userAuthTicket", null);
        if(authTicketJson != null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeTypeConverter());
            Gson gson = gsonBuilder.create();
            ticket = gson.fromJson(authTicketJson, AuthTicket.class);
        }

        return ticket;
    }

    public void setUserAuthTicket(Context ctx, AuthTicket ticket) {

        if(ticket != null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeTypeConverter());
            Gson gson = gsonBuilder.create();
            String authTicketJson = gson.toJson(ticket);
            SharedPreferences prefs = ctx.getSharedPreferences(PREFERENCES, 0);
            SharedPreferences.Editor edit = prefs.edit();
            edit.putString("userAuthTicket", authTicketJson);
            edit.commit();
        }
    }

    public Tenant getTenant(Context ctx) {

        Tenant tenant = null;

        SharedPreferences prefs = ctx.getSharedPreferences(PREFERENCES, 0);
        String tenantJson = prefs.getString("tenant", null);
        if(tenantJson != null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeTypeConverter());
            Gson gson = gsonBuilder.create();
            tenant = gson.fromJson(tenantJson, Tenant.class);
        }

        return tenant;
    }

    public void setTenant(Context ctx, Tenant tenant) {

        if(tenant != null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeTypeConverter());
            Gson gson = gsonBuilder.create();
            String tenantJson = gson.toJson(tenant);
            SharedPreferences prefs = ctx.getSharedPreferences(PREFERENCES, 0);
            SharedPreferences.Editor edit = prefs.edit();
            edit.putString("tenant", tenantJson);
            edit.commit();
        }
    }

    public String getLocationCode(Context ctx) {
        return ctx.getSharedPreferences(PREFERENCES, 0).getString("locationCode", null);
    }

    public String getLocationName(Context ctx) {
        return ctx.getSharedPreferences(PREFERENCES, 0).getString("locationName", null);
    }

    public void setLocation(Context ctx, String code, String name) {
        SharedPreferences.Editor editor = ctx.getSharedPreferences(PREFERENCES, 0).edit();
        editor.putString("locationCode", code);
        editor.putString("locationName", name);
        editor.commit();
    }
}
