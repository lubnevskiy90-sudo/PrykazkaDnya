package com.example.prykazkadnya

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class PrykazkaWidget : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    companion object {
        fun updateAppWidget(
            context: Context,
            appWidgetManager: AppWidgetManager,
            appWidgetId: Int
        ) {
            val proverb = PrykazkiRepository.getProverbOfDay()
            val views = RemoteViews(context.packageName, R.layout.widget_prykazka)
            
            views.setTextViewText(R.id.tv_prykazka, proverb)

            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}
