package com.bansos567.tampads;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

// Import bawaan MIT App Inventor / Kodular
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleComponent;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
    version = 1,
    description = "Ekstensi Mediasi Iklan Khusus Tamoda",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png"
)
@SimpleObject(external = true)
@SimpleComponent
public class TampAds extends AndroidNonvisibleComponent {

    private Context context;

    // KOSTRUKTOR UTAMA (WAJIB ADA)
    public TampAds(ComponentContainer container) {
        super(container.$form());
        this.context = container.$context();
        Log.d("TampAds", "Ekstensi TampAds Dimuat");
    }

    // ========================================================
    // --- NANTI KITA TAMBAH KODE LOGIKA IKLAN DI BAWAH SINI ---
    // ========================================================

    @SimpleFunction(description = "Inisialisasi awal SDK Iklan")
    public void InitializeAds() {
        // Nanti kode pemanggil SDK AppLovin/AdMob ditaruh di dalam blok ini
        Toast.makeText(context, "Mempersiapkan Mesin Iklan Tamoda...", Toast.LENGTH_SHORT).show();
        
        // Memancing Event bahwa SDK sudah siap
        OnSdkInitialized();
    }

    @SimpleEvent(description = "Terpicu saat SDK Iklan berhasil dimuat dan siap digunakan")
    public void OnSdkInitialized() {
        EventDispatcher.dispatchEvent(this, "OnSdkInitialized");
    }

    // ========================================================
    // --- BATAS KODE LOGIKA IKLAN ---
    // ========================================================
}
