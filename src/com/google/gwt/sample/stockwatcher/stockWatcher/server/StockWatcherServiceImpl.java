package com.google.gwt.sample.stockwatcher.stockWatcher.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.gwt.sample.stockwatcher.stockWatcher.client.StockWatcherService;

public class StockWatcherServiceImpl extends RemoteServiceServlet implements StockWatcherService
{
    // Implementation of sample interface method
    public String getMessage(String msg)
    {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}