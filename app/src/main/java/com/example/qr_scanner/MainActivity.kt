package com.example.qr_scanner

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.qr_scanner.navigation.AppNavGraph
import com.example.qr_scanner.ui.theme.Qr_scannerTheme
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanOptions
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val qrScanLauncher = registerForActivityResult(ScanContract()) { result ->
        if (result.contents == null) {
            Toast.makeText(this, "No scan data received!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Scanned: ${result.contents}", Toast.LENGTH_SHORT).show()
        }

    }
    private fun QRScan() {
        val options = ScanOptions()
        options.setDesiredBarcodeFormats(ScanOptions.ALL_CODE_TYPES)
        options.setPrompt("Просканируйте QR-код")
        options.setCameraId(0)
        options.setBeepEnabled(false)
        options.setBarcodeImageEnabled(true)
        qrScanLauncher.launch(options)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Qr_scannerTheme {
                AppNavGraph()
            }
        }
    }
}




