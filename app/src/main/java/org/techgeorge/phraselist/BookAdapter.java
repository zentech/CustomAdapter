package org.techgeorge.phraselist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {
    private ArrayList<Book> bookList;

    public BookAdapter(@NonNull Context context, int resource, ArrayList<Book> bookList) {
        super(context, resource);
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int phraseIndex = position;
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        ImageView bookImage = convertView.findViewById(R.id.book_imageview);
        TextView titleTextView = convertView.findViewById(R.id.title_textview);
        TextView authorTextView = convertView.findViewById(R.id.author_textview);

        bookImage.setImageResource(bookList.get(position).getBookImageId());
        titleTextView.setText(bookList.get(position).getBookTitle());
        authorTextView.setText(bookList.get(position).getBookAuthor());

        return convertView;
    }
}
