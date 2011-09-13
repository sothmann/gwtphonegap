package de.kurka.phonegap.client.file.js;

import com.google.gwt.core.client.JavaScriptObject;

import de.kurka.phonegap.client.file.FileError;
import de.kurka.phonegap.client.file.FileWriter;
import de.kurka.phonegap.client.file.WriterCallback;

public class FileWriterJsImpl implements FileWriter {

	private final JavaScriptObject writer;

	public FileWriterJsImpl(JavaScriptObject writer) {
		this.writer = writer;
	}

	public JavaScriptObject getWriter() {
		return writer;
	}

	@Override
	public native int getReadyState() /*-{
		return (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer).readyState;
	}-*/;

	@Override
	public native String getFileName() /*-{
		return (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer).fileName;
	}-*/;

	@Override
	public long getLength() {
		return Math.round(getLength0());
	}

	private native double getLength0()/*-{
		return (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer).length;
	}-*/;

	@Override
	public long getPosition() {
		return Math.round(getPosition0());
	}

	private native double getPosition0()/*-{
		return (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer).position;
	}-*/;

	@Override
	public native FileError getError()/*-{
		return (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer).error;
	}-*/;

	@Override
	public native void setOnWriteStartCallback(WriterCallback<FileWriter> callback) /*-{
		var that = this;
		var cal = function() {
			that.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::onCallBack(Lde/kurka/phonegap/client/file/WriterCallback;)(callback);
		};
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.onwritestart = cal;
	}-*/;

	private void onCallBack(WriterCallback<FileWriter> callback) {
		callback.onCallback(this);
	}

	@Override
	public native void setOnProgressCallback(WriterCallback<FileWriter> callback) /*-{
		var that = this;
		var cal = function() {
			that.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::onCallBack(Lde/kurka/phonegap/client/file/WriterCallback;)(callback);
		};
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.onprogress = cal;
	}-*/;

	@Override
	public native void setOnWriteCallback(WriterCallback<FileWriter> callback)/*-{
		var that = this;
		var cal = function() {
			that.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::onCallBack(Lde/kurka/phonegap/client/file/WriterCallback;)(callback);
		};
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.onwrite = cal;
	}-*/;

	@Override
	public native void setOnAbortCallback(WriterCallback<FileWriter> callback) /*-{
		var that = this;
		var cal = function() {
			that.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::onCallBack(Lde/kurka/phonegap/client/file/WriterCallback;)(callback);
		};
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.onabort = cal;
	}-*/;

	@Override
	public native void setOnErrorCallback(WriterCallback<FileWriter> callback) /*-{
		var that = this;
		var cal = function() {
			that.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::onCallBack(Lde/kurka/phonegap/client/file/WriterCallback;)(callback);
		};
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.onerror = cal;
	}-*/;

	@Override
	public native void setOnWriteEndCallback(WriterCallback<FileWriter> callback) /*-{
		var that = this;
		var cal = function() {
			that.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::onCallBack(Lde/kurka/phonegap/client/file/WriterCallback;)(callback);
		};
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.onwriteend = cal;
	}-*/;

	@Override
	public native void abort() /*-{
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.abort();
	}-*/;

	@Override
	public void seek(long position) {
		seek(position);
	}

	private native void seek(double position)/*-{
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.seek(position);
	}-*/;

	@Override
	public void truncate(long position) {
		truncate(position);
	}

	private native void truncate(double position)/*-{
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.truncate(position);
	}-*/;

	@Override
	public native void write(String text) /*-{
		var writer = (this.@de.kurka.phonegap.client.file.js.FileWriterJsImpl::writer);
		writer.write(text);
	}-*/;

}