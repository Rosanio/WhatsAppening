package com.epicodus.whatsappening.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.epicodus.whatsappening.R;
import com.epicodus.whatsappening.models.Friend;
import com.epicodus.whatsappening.util.FirebaseRecyclerAdapter;
import com.firebase.client.Query;

/**
 * Created by Guest on 5/4/16.
 */
public class FirebaseFriendListAdapter extends FirebaseRecyclerAdapter<FriendViewHolder, Friend> {

    public FirebaseFriendListAdapter(Query query, Class<Friend> itemClass) {
        super(query, itemClass);
    }

    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.friend_list_item, parent, false);
        return new FriendViewHolder(view, getItems());
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, int position) {
        holder.bindUser(getItem(position));
    }

    @Override
    protected void itemAdded(Friend item, String key, int position) {

    }

    @Override
    protected void itemChanged(Friend oldItem, Friend newItem, String key, int position) {

    }

    @Override
    protected void itemRemoved(Friend item, String key, int position) {

    }

    @Override
    protected void itemMoved(Friend item, String key, int oldPosition, int newPosition) {

    }
}