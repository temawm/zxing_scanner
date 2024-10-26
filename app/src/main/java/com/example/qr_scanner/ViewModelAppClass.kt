package com.example.qr_scanner

import androidx.lifecycle.ViewModel
import com.example.qr_scanner.dbProvideModule.MainDb
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanOptions
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ViewModelAppClass @Inject constructor(Database: MainDb): ViewModel() {

}