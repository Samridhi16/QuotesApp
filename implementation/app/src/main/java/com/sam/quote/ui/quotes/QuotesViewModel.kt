package com.sam.quote.ui.quotes

import androidx.lifecycle.ViewModel
import com.sam.quote.data.Quote
import com.sam.quote.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}