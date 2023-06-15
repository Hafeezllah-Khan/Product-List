package com.example.listitemsprinter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList: List<Product>, private val context: Context) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.checkBox.isChecked = product.isSelected
        holder.productName.text = product.name
        holder.productQuantity.text = product.quantity.toString()
        holder.productPrice.text = product.price
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
        val productName: TextView = itemView.findViewById(R.id.productName)
        val productQuantity: TextView = itemView.findViewById(R.id.productQuantity)
        val productPrice: TextView = itemView.findViewById(R.id.textView3)
    }
}
