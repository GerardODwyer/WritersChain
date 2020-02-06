package com.example.writerschain.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.writerschain.R;
import com.example.writerschain.constructors.Chain;

import java.util.List;

public class ChainAdapter extends RecyclerView.Adapter<ChainAdapter.MyViewHolder> {

    private List<Chain> chainList;




    public ChainAdapter(List<Chain> chainList) {
        this.chainList = chainList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Chain chain = chainList.get(position);
        holder.chainName.setText(chain.getChainName());
        holder.chainID.setText(chain.getChainID());
        holder.chainAuthor.setText(chain.getChainAuthor());
        holder.chainDesc.setText(chain.getChainDescription());
        holder.dateCreated.setText(chain.getDateCreated());
        holder.chainGenre.setText(chain.getChainGenre());
        holder.chapterCount.setText(chain.getChapterCount());
        holder.chainUpvotes.setText(chain.getChainUpvotes());


    }

    @Override
    public int getItemCount() {
        return chainList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView chainName, chainID, chainAuthor, chainDesc, dateCreated, chainGenre, chapterCount, chainUpvotes;

        public MyViewHolder(View view) {
            super(view);
            chainName = (TextView) view.findViewById(R.id.chainName_text);
            chainID = (TextView) view.findViewById(R.id.chainID_text);
            chainAuthor = (TextView) view.findViewById(R.id.chainAuthor_text);
            chainDesc = (TextView) view.findViewById(R.id.chainDesc_text);
            dateCreated = (TextView) view.findViewById(R.id.dateCreated_text);
            chainGenre = (TextView) view.findViewById(R.id.chainGenre_text);
            chapterCount = (TextView) view.findViewById(R.id.chapterCount_text);
            chainUpvotes = (TextView) view.findViewById(R.id.chainUpvotes_text);
        }
    }
}

