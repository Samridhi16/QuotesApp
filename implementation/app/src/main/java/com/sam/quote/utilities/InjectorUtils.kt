package com.sam.quote.utilities

import com.sam.quote.data.FakeDatabase
import com.sam.quote.data.QuoteRepository
import com.sam.quote.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory():QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}