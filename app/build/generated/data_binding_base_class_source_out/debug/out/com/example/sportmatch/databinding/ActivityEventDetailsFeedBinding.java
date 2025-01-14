// Generated by view binder compiler. Do not edit!
package com.example.sportmatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportmatch.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEventDetailsFeedBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backhomeF;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final TextView detailsAdminF;

  @NonNull
  public final TextView detailsAdminInput;

  @NonNull
  public final Button detailsBtnMap;

  @NonNull
  public final Button detailsBtnParticipate;

  @NonNull
  public final TextView detailsDate;

  @NonNull
  public final TextView detailsDateInput;

  @NonNull
  public final TextView detailsDesc;

  @NonNull
  public final TextView detailsDescInput;

  @NonNull
  public final TextView detailsLoc;

  @NonNull
  public final TextView detailsLocInput;

  @NonNull
  public final TextView detailsPlayers;

  @NonNull
  public final TextView detailsPlayersInput;

  @NonNull
  public final TextView detailsSport;

  @NonNull
  public final TextView detailsSportInput;

  @NonNull
  public final TextView detailsTime;

  @NonNull
  public final TextView detailsTimeInput;

  @NonNull
  public final TextView detailsTitle;

  @NonNull
  public final ImageView sportImage;

  @NonNull
  public final TextView title;

  private ActivityEventDetailsFeedBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView backhomeF, @NonNull BottomNavigationView bottomNavigationView,
      @NonNull TextView detailsAdminF, @NonNull TextView detailsAdminInput,
      @NonNull Button detailsBtnMap, @NonNull Button detailsBtnParticipate,
      @NonNull TextView detailsDate, @NonNull TextView detailsDateInput,
      @NonNull TextView detailsDesc, @NonNull TextView detailsDescInput,
      @NonNull TextView detailsLoc, @NonNull TextView detailsLocInput,
      @NonNull TextView detailsPlayers, @NonNull TextView detailsPlayersInput,
      @NonNull TextView detailsSport, @NonNull TextView detailsSportInput,
      @NonNull TextView detailsTime, @NonNull TextView detailsTimeInput,
      @NonNull TextView detailsTitle, @NonNull ImageView sportImage, @NonNull TextView title) {
    this.rootView = rootView;
    this.backhomeF = backhomeF;
    this.bottomNavigationView = bottomNavigationView;
    this.detailsAdminF = detailsAdminF;
    this.detailsAdminInput = detailsAdminInput;
    this.detailsBtnMap = detailsBtnMap;
    this.detailsBtnParticipate = detailsBtnParticipate;
    this.detailsDate = detailsDate;
    this.detailsDateInput = detailsDateInput;
    this.detailsDesc = detailsDesc;
    this.detailsDescInput = detailsDescInput;
    this.detailsLoc = detailsLoc;
    this.detailsLocInput = detailsLocInput;
    this.detailsPlayers = detailsPlayers;
    this.detailsPlayersInput = detailsPlayersInput;
    this.detailsSport = detailsSport;
    this.detailsSportInput = detailsSportInput;
    this.detailsTime = detailsTime;
    this.detailsTimeInput = detailsTimeInput;
    this.detailsTitle = detailsTitle;
    this.sportImage = sportImage;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEventDetailsFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEventDetailsFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_event_details_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEventDetailsFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backhomeF;
      ImageView backhomeF = ViewBindings.findChildViewById(rootView, id);
      if (backhomeF == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.detailsAdminF;
      TextView detailsAdminF = ViewBindings.findChildViewById(rootView, id);
      if (detailsAdminF == null) {
        break missingId;
      }

      id = R.id.detailsAdminInput;
      TextView detailsAdminInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsAdminInput == null) {
        break missingId;
      }

      id = R.id.detailsBtnMap;
      Button detailsBtnMap = ViewBindings.findChildViewById(rootView, id);
      if (detailsBtnMap == null) {
        break missingId;
      }

      id = R.id.detailsBtnParticipate;
      Button detailsBtnParticipate = ViewBindings.findChildViewById(rootView, id);
      if (detailsBtnParticipate == null) {
        break missingId;
      }

      id = R.id.detailsDate;
      TextView detailsDate = ViewBindings.findChildViewById(rootView, id);
      if (detailsDate == null) {
        break missingId;
      }

      id = R.id.detailsDateInput;
      TextView detailsDateInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsDateInput == null) {
        break missingId;
      }

      id = R.id.detailsDesc;
      TextView detailsDesc = ViewBindings.findChildViewById(rootView, id);
      if (detailsDesc == null) {
        break missingId;
      }

      id = R.id.detailsDescInput;
      TextView detailsDescInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsDescInput == null) {
        break missingId;
      }

      id = R.id.detailsLoc;
      TextView detailsLoc = ViewBindings.findChildViewById(rootView, id);
      if (detailsLoc == null) {
        break missingId;
      }

      id = R.id.detailsLocInput;
      TextView detailsLocInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsLocInput == null) {
        break missingId;
      }

      id = R.id.detailsPlayers;
      TextView detailsPlayers = ViewBindings.findChildViewById(rootView, id);
      if (detailsPlayers == null) {
        break missingId;
      }

      id = R.id.detailsPlayersInput;
      TextView detailsPlayersInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsPlayersInput == null) {
        break missingId;
      }

      id = R.id.detailsSport;
      TextView detailsSport = ViewBindings.findChildViewById(rootView, id);
      if (detailsSport == null) {
        break missingId;
      }

      id = R.id.detailsSportInput;
      TextView detailsSportInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsSportInput == null) {
        break missingId;
      }

      id = R.id.detailsTime;
      TextView detailsTime = ViewBindings.findChildViewById(rootView, id);
      if (detailsTime == null) {
        break missingId;
      }

      id = R.id.detailsTimeInput;
      TextView detailsTimeInput = ViewBindings.findChildViewById(rootView, id);
      if (detailsTimeInput == null) {
        break missingId;
      }

      id = R.id.detailsTitle;
      TextView detailsTitle = ViewBindings.findChildViewById(rootView, id);
      if (detailsTitle == null) {
        break missingId;
      }

      id = R.id.sportImage;
      ImageView sportImage = ViewBindings.findChildViewById(rootView, id);
      if (sportImage == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityEventDetailsFeedBinding((RelativeLayout) rootView, backhomeF,
          bottomNavigationView, detailsAdminF, detailsAdminInput, detailsBtnMap,
          detailsBtnParticipate, detailsDate, detailsDateInput, detailsDesc, detailsDescInput,
          detailsLoc, detailsLocInput, detailsPlayers, detailsPlayersInput, detailsSport,
          detailsSportInput, detailsTime, detailsTimeInput, detailsTitle, sportImage, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
