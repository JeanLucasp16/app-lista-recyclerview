package com.example.listadeprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeprodutos.Adapter.AdapterProduto
import com.example.listadeprodutos.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val recyclerView_produto = findViewById<RecyclerView>(R.id.recyclerView_produto)
        recyclerView_produto.layoutManager = LinearLayoutManager(this)
        recyclerView_produto.setHasFixedSize(true)


        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recyclerView_produto.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.caixa,
            "Gabinete Nox Hummer",
            "Torre intermediária de luxo com um impressionante design minimalista .",
            "120€"
        )
        listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.placamae,
            "ASUS ROG STRIX B650-A",
            "ATX ASUS ROG STRIX B650-A GAMING WIFI, com socket AMD Ryzen AM5, chipset B650, 12 + 2 estágios de energia, DDR5.",
            "264€"
        )
        listaProdutos.add(produto2)

        val produto3 = Produto(
            R.drawable.processador,
            "AMD Ryzen 7 7700X 4.5 GHz",
            "AMD Ryzen 7000 libera velocidade incrível e potência “Zen 4” para que jogadores  possam se alimentar de qualquer jogo.",
            "387€"
        )
        listaProdutos.add(produto3)

        val produto4 = Produto(
            R.drawable.memoria,
            "Corsair Vengeance RGB White DDR5 5200MHz 32GB",
            "Oferece desempenho DDR5, frequências mais altas e maior capacidade, luz RGB de dez zonas, dinâmica e endereçável individualmente.",
            "173€"
        )
        listaProdutos.add(produto4)

        val produto5 = Produto(
            R.drawable.ssd,
            "Samsung 980 Pro SSD 1TB PCIe NVMe M.2",
            "PCIe 4.0, o 980 PRO oferece o dobro da taxa de transferência de dados da PCIe 3.0, ao mesmo tempo que suporta a PCIe 3.0 para maior versatilidade.",
            "139€"
        )
        listaProdutos.add(produto5)

        val produto6 = Produto(
            R.drawable.placadevideo,
            "GeForce RTX 3060 Ti VISION OC 8GB GDDR6",
            "NVIDIA Reflex oferece a vantagem competitiva definitiva. A menor latência. A melhor capacidade de resposta.",
            "582€"
        )
        listaProdutos.add(produto6)

        val produto7 = Produto(
            R.drawable.watercooler,
            "Nfortec Atria RGB 360 White Kit de Refrigeração Líquida",
            " O design de ventilação emprega 7 lâminas, alojadas numa estrutura fina e de aparência leve mas forte.",
            "114€"
        )
        listaProdutos.add(produto7)

        val produto8 = Produto(
            R.drawable.fonte,
            "Corsair RM White Series RM850 850W 80 Plus Gold Full Modular",
            "Conectores EPS12V duplos/triplos fornecem energia eficiente ao seu PC com certificação 80 PLUS Gold.",
            "162€"
        )

        listaProdutos.add(produto8)

    }
}