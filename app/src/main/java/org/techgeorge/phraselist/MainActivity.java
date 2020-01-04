package org.techgeorge.phraselist;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList = new ArrayList<>();

        //getting string arrays from resource
        Resources res = getResources();
        String[] allBooks = res.getStringArray(R.array.books);
        String[] allAuthors = res.getStringArray(R.array.authors);

        pupoluateBookList(allBooks, allAuthors);

        //setting adapter and listview
        BookAdapter adapter = new BookAdapter(getApplicationContext(),
                R.layout.list_item, bookList);
        ListView listview = findViewById(R.id.book_list);
        listview.setAdapter(adapter);

    }

    public void pupoluateBookList(String[] books, String[] authors) {
        bookList.add(new Book(books[0], authors[0], R.drawable.davinci_code));
        bookList.add(new Book(books[1], authors[1], R.drawable.girl_train));
        bookList.add(new Book(books[2], authors[2], R.drawable.harry_potter));
        bookList.add(new Book(books[3], authors[3], R.drawable.hunder_games));
        bookList.add(new Book(books[4], authors[4], R.drawable.lord_rings));
        bookList.add(new Book(books[5], authors[5], R.drawable.moby_dick));
        bookList.add(new Book(books[6], authors[6], R.drawable.mocking_bird));
        bookList.add(new Book(books[7], authors[7], R.drawable.the_godfather));
    }

}
